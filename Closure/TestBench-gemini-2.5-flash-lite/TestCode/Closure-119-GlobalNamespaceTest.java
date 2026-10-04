package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.StaticReference;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import com.google.javascript.rhino.jstype.StaticSymbolTable;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GlobalNamespaceTest {

    // Mock AbstractCompiler and its dependencies.
    // This is a minimal mock to satisfy the compiler and GlobalNamespace constructor.

    // Mock Node to avoid complex AST creation.

    private JSModule module = new JSModule("test");





















































    @Test
    public void testGetValueType_hook() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();
        Node hookNode = new MockNode(Token.HOOK);
        Node trueBranch = new MockNode(Token.FUNCTION); // Type FUNCTION
        Node falseBranch = new MockNode(Token.OBJECTLIT); // Type OBJECTLIT
        hookNode.addChildToBack(new MockNode(Token.NAME, "condition")); // Condition
        hookNode.addChildToBack(trueBranch);
        hookNode.addChildToBack(falseBranch);
        // For HOOK, it recurses. If the second value (trueBranch) is not OTHER, it returns its type.
        // Here, it's FUNCTION. If it were OTHER, it would check the third.
        // The current implementation checks the second child first, then third if second is OTHER.
        // So it should return FUNCTION.
        assertEquals(GlobalNamespace.Name.Type.FUNCTION, builder.getValueType(hookNode));

        // Test case where second branch is OTHER
        Node hookNode2 = new MockNode(Token.HOOK);
        Node otherBranch = new MockNode(Token.NAME, "other"); // Type OTHER
        Node objLitBranch = new MockNode(Token.OBJECTLIT); // Type OBJECTLIT
        hookNode2.addChildToBack(new MockNode(Token.NAME, "condition2"));
        hookNode2.addChildToBack(otherBranch);
        hookNode2.addChildToBack(objLitBranch);
        assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, builder.getValueType(hookNode2));
    }

    @Test
    public void testHandleSetFromGlobal_simpleVar() throws Exception {
        GlobalNamespace gn = createNamespace(root, externsRoot);
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("myVar", null, false);
        gn.nameMap.put("myVar", nameObj); // Pre-populate nameMap

        // Create a mock node for the assignment.
        Node nameNode = new MockNode(Token.NAME, "myVar");
        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();

        builder.handleSetFromGlobal(module, scope, nameNode, null, "myVar", false, GlobalNamespace.Name.Type.OTHER);

        assertEquals(1, nameObj.getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, nameObj.getRefs().get(0).type);
        assertEquals(GlobalNamespace.Name.Type.OTHER, nameObj.type); // Type should be updated.
    }

    @Test
    public void testHandleSetFromGlobal_constructorDeclaration() throws Exception {
        GlobalNamespace gn = createNamespace(root, externsRoot);
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("MyClass", null, false);
        gn.nameMap.put("MyClass", nameObj);

        Node funcNode = new MockNode(Token.FUNCTION); // Node representing the function value
        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.setConstructor(true);
        funcNode.setJSDocInfo(jsDocInfo); // Attach JSDocInfo

        Node nameNode = new MockNode(Token.NAME, "MyClass");
        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();

        builder.handleSetFromGlobal(module, scope, nameNode, funcNode, "MyClass", false, GlobalNamespace.Name.Type.FUNCTION);

        assertTrue(nameObj.isDeclaredType()); // Should mark as declared type.
        assertEquals(GlobalNamespace.Name.Type.FUNCTION, nameObj.type); // Type should be updated.
    }

    @Test
    public void testHandleSetFromLocal_simpleVar() throws Exception {
        GlobalNamespace gn = createNamespace(root, externsRoot);
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("myVar", null, false);
        gn.nameMap.put("myVar", nameObj);

        Node nameNode = new MockNode(Token.NAME, "myVar");
        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();

        builder.handleSetFromLocal(module, scope, nameNode, null, "myVar");

        assertEquals(1, nameObj.getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_LOCAL, nameObj.getRefs().get(0).type);
    }

    @Test
    public void testHandleGet_direct() throws Exception {
        GlobalNamespace gn = createNamespace(root, externsRoot);
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("myVar", null, false);
        gn.nameMap.put("myVar", nameObj);

        Node nameNode = new MockNode(Token.NAME, "myVar");
        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();

        builder.handleGet(module, scope, nameNode, null, "myVar", GlobalNamespace.Ref.Type.DIRECT_GET);

        assertEquals(1, nameObj.getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.DIRECT_GET, nameObj.getRefs().get(0).type);
    }

    @Test
    public void testMaybeHandlePrototypePrefix_endsWithPrototype() throws Exception {
        GlobalNamespace gn = createNamespace(root, externsRoot);
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("MyClass", null, false);
        gn.nameMap.put("MyClass", nameObj); // Ensure 'MyClass' exists in the map.

        // Simulate a node that is part of "MyClass.prototype.method"
        Node mockNodeForCall = new MockNode(Token.GETPROP); // Represents 'MyClass.prototype'
        mockNodeForCall.setString("MyClass.prototype");
        mockNodeForCall.addChildToBack(new MockNode(Token.NAME, "MyClass"));
        mockNodeForCall.addChildToBack(new MockNode(Token.STRING_KEY, "prototype"));

        // The parent of mockNodeForCall, representing "MyClass.prototype.method"
        Node parentOfMockNode = new MockNode(Token.GETPROP);
        parentOfMockNode.setString("MyClass.prototype.method");
        parentOfMockNode.addChildToBack(mockNodeForCall); // MyClass.prototype is the base
        parentOfMockNode.addChildToBack(new MockNode(Token.STRING_KEY, "method"));


        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();
        // Call with the node representing "MyClass.prototype" and its parent.
        builder.maybeHandlePrototypePrefix(module, scope, mockNodeForCall, parentOfMockNode, "MyClass.prototype.method");

        assertNotNull(gn.getNameIndex().get("MyClass"));
        GlobalNamespace.Name prefixName = gn.getNameIndex().get("MyClass");
        assertEquals(1, prefixName.getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.PROTOTYPE_GET, prefixName.getRefs().get(0).type);
    }

    @Test
    public void testMaybeHandlePrototypePrefix_containsPrototype() throws Exception {
        GlobalNamespace gn = createNamespace(root, externsRoot);
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("namespace", null, false);
        gn.nameMap.put("namespace", nameObj); // Ensure 'namespace' exists.

        // Simulate a node that is part of "namespace.sub.prototype.method"
        Node mockNodeForCall = new MockNode(Token.GETPROP); // Represents 'namespace.sub.prototype'
        mockNodeForCall.setString("namespace.sub.prototype");
        Node baseForProto = new MockNode(Token.GETPROP); // Represents 'namespace.sub'
        baseForProto.setString("namespace.sub");
        baseForProto.addChildToBack(new MockNode(Token.NAME, "namespace"));
        baseForProto.addChildToBack(new MockNode(Token.STRING_KEY, "sub"));
        mockNodeForCall.addChildToBack(baseForProto);
        mockNodeForCall.addChildToBack(new MockNode(Token.STRING_KEY, "prototype"));


        // The parent of mockNodeForCall, representing "namespace.sub.prototype.method"
        Node parentOfMockNode = new MockNode(Token.GETPROP);
        parentOfMockNode.setString("namespace.sub.prototype.method");
        parentOfMockNode.addChildToBack(mockNodeForCall); // namespace.sub.prototype is the base
        parentOfMockNode.addChildToBack(new MockNode(Token.STRING_KEY, "method"));

        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();
        // Call with the node representing "namespace.sub.prototype" and its parent.
        builder.maybeHandlePrototypePrefix(module, scope, mockNodeForCall, parentOfMockNode, "namespace.sub.prototype.method");

        assertNotNull(gn.getNameIndex().get("namespace"));
        GlobalNamespace.Name prefixName = gn.getNameIndex().get("namespace");
        assertEquals(1, prefixName.getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.PROTOTYPE_GET, prefixName.getRefs().get(0).type);
    }

    @Test
    public void testIsNestedAssign_true() throws Exception {
        Node parent = new MockNode(Token.ASSIGN);
        Node grandParent = new MockNode(Token.BLOCK); // Assignment not directly in EXPR_RESULT
        parent.setParent(grandParent); // Set parent for isNestedAssign to check parent's parent

        GlobalNamespace gn = createNamespace(root);
        assertTrue(gn.new BuildGlobalNamespace().isNestedAssign(parent));
    }

    @Test
    public void testIsNestedAssign_false() throws Exception {
        Node parent = new MockNode(Token.ASSIGN);
        Node grandParent = new MockNode(Token.EXPR_RESULT); // Assignment directly in EXPR_RESULT
        parent.setParent(grandParent);

        GlobalNamespace gn = createNamespace(root);
        assertFalse(gn.new BuildGlobalNamespace().isNestedAssign(parent));
    }

    @Test
    public void testGetOrCreateName_existing() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        GlobalNamespace.Name existingName = new GlobalNamespace.Name("existing", null, false);
        gn.nameMap.put("existing", existingName); // Add to map

        GlobalNamespace.Name retrievedName = gn.getOrCreateName("existing");
        assertSame(existingName, retrievedName); // Should return the existing instance.
    }

    @Test
    public void testGetOrCreateName_newSimpleName() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        GlobalNamespace.Name createdName = gn.getOrCreateName("newSimple");

        assertNotNull(createdName);
        assertEquals("newSimple", createdName.getBaseName());
        assertNull(createdName.parent); // Simple names have no parent.
        assertNotNull(gn.nameMap.get("newSimple"));
        assertSame(createdName, gn.nameMap.get("newSimple")); // Should be in the map.
        assertEquals(1, gn.globalNames.size()); // Should be added to globalNames.
        assertSame(createdName, gn.globalNames.get(0));
    }

    @Test
    public void testGetOrCreateName_newQualifiedName() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        GlobalNamespace.Name createdName = gn.getOrCreateName("a.b.c"); // Create a qualified name.

        assertNotNull(createdName);
        assertEquals("c", createdName.getBaseName()); // Base name is the last part.
        assertNotNull(createdName.parent); // Should have a parent.
        assertEquals("a.b", createdName.parent.getFullName()); // Parent's full name.
        assertNotNull(gn.nameMap.get("a.b.c")); // 'c' itself should be in the map.
        assertSame(createdName, gn.nameMap.get("a.b.c"));

        // Intermediate names should also be created and mapped.
        assertNotNull(gn.nameMap.get("a"));
        assertNotNull(gn.nameMap.get("a.b"));

        GlobalNamespace.Name nameA = gn.nameMap.get("a");
        assertNotNull(nameA);
        assertNull(nameA.parent); // 'a' is a top-level name.
        assertEquals(1, nameA.props.size()); // 'a' should have 'b' as a property.
        assertEquals("b", nameA.props.get(0).getBaseName());

        GlobalNamespace.Name nameAB = gn.nameMap.get("a.b");
        assertNotNull(nameAB);
        assertSame(nameA, nameAB.parent); // Parent of 'a.b' is 'a'.
        assertEquals(1, nameAB.props.size()); // 'a.b' should have 'c' as a property.
        assertEquals("c", nameAB.props.get(0).getBaseName());
        assertSame(createdName, nameAB.props.get(0)); // The property should be the created name 'c'.
    }

    @Test
    public void testName_addProperty() throws Exception {
        GlobalNamespace.Name parentName = new GlobalNamespace.Name("parent", null, false);
        GlobalNamespace.Name propName = parentName.addProperty("child", false); // Add property 'child'.

        assertNotNull(propName);
        assertEquals("child", propName.getBaseName());
        assertSame(parentName, propName.parent); // Parent link should be set.
        assertEquals("parent.child", propName.getFullName()); // Full name should be correct.
        assertEquals(1, parentName.props.size()); // Props list should contain the new name.
        assertSame(propName, parentName.props.get(0));
    }

    @Test
    public void testName_getFullName() throws Exception {
        // Build a chain of names: a -> b -> c
        GlobalNamespace.Name nameA = new GlobalNamespace.Name("a", null, false);
        GlobalNamespace.Name nameB = new GlobalNamespace.Name("b", nameA, false);
        GlobalNamespace.Name nameC = new GlobalNamespace.Name("c", nameB, false);

        assertEquals("a", nameA.getFullName());
        assertEquals("a.b", nameB.getFullName());
        assertEquals("a.b.c", nameC.getFullName());
    }

    @Test
    public void testName_addRef() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        // Create dummy Ref objects.
        Ref ref1 = Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
        Ref ref2 = Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);

        nameObj.addRef(ref1);
        assertEquals(1, nameObj.getRefs().size());
        nameObj.addRef(ref2);
        assertEquals(2, nameObj.getRefs().size());
        assertTrue(nameObj.getRefs().contains(ref1));
        assertTrue(nameObj.getRefs().contains(ref2));

        // Check counters are updated correctly.
        assertEquals(1, nameObj.globalSets); // ref2 is SET_FROM_GLOBAL
        assertEquals(0, nameObj.localSets);
        assertEquals(1, nameObj.totalGets); // ref1 is DIRECT_GET
    }

    @Test
    public void testName_removeRef() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        Ref ref1 = Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
        Ref ref2 = Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        nameObj.addRef(ref1);
        nameObj.addRef(ref2);

        nameObj.removeRef(ref1);
        assertEquals(1, nameObj.getRefs().size());
        assertFalse(nameObj.getRefs().contains(ref1));
        assertTrue(nameObj.getRefs().contains(ref2));
        assertEquals(1, nameObj.globalSets); // ref2 still present
        assertEquals(0, nameObj.totalGets); // ref1 removed

        nameObj.removeRef(ref2);
        assertTrue(nameObj.getRefs().isEmpty());
        assertEquals(0, nameObj.globalSets); // ref2 removed
        assertEquals(0, nameObj.totalGets);
    }

    @Test
    public void testName_canEliminate_true() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        nameObj.globalSets = 1; // Needs at least one set.
        // Other conditions for canEliminate: totalGets = 0, deleteProps = 0, canCollapseUnannotatedChildNames() = true.
        // By default, these are 0, and canCollapseUnannotatedChildNames() will be true for this setup.
        assertTrue(nameObj.canEliminate());
    }

    @Test
    public void testName_canEliminate_false_totalGets() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        nameObj.globalSets = 1;
        nameObj.totalGets = 1; // Has gets, so cannot eliminate.
        assertFalse(nameObj.canEliminate());
    }

    @Test
    public void testName_isSimpleStubDeclaration() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        Ref ref = Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        // Mock a node that is a child of EXPR_RESULT.
        Node mockNode = new MockNode(Token.NAME, "testName");
        Node exprResultNode = new MockNode(Token.EXPR_RESULT);
        exprResultNode.addChildToBack(mockNode); // MockNode is a child of EXPR_RESULT.
        mockNode.setParent(exprResultNode); // Set parent link.
        ref.node = mockNode; // Assign the mock node to the ref.
        nameObj.addRef(ref); // Add the ref to the name object.

        assertTrue(nameObj.isSimpleStubDeclaration());
    }

    @Test
    public void testName_canCollapse_true() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        nameObj.globalSets = 1;
        nameObj.localSets = 0;
        nameObj.deleteProps = 0;
        nameObj.declaredType = false;
        assertTrue(nameObj.canCollapse());
    }

    @Test
    public void testName_canCollapse_false_inExterns() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, true); // inExterns = true
        nameObj.globalSets = 1;
        assertFalse(nameObj.canCollapse()); // Cannot collapse externs.
    }

    @Test
    public void testName_isGetOrSetDefinition() throws Exception {
        GlobalNamespace.Name nameObjGetter = new GlobalNamespace.Name("testName", null, false);
        nameObjGetter.type = GlobalNamespace.Name.Type.GET; // Set type to GET.
        assertTrue(nameObjGetter.isGetOrSetDefinition());

        GlobalNamespace.Name nameObjSetter = new GlobalNamespace.Name("testName", null, false);
        nameObjSetter.type = GlobalNamespace.Name.Type.SET; // Set type to SET.
        assertTrue(nameObjSetter.isGetOrSetDefinition());

        GlobalNamespace.Name nameObjOther = new GlobalNamespace.Name("testName", null, false);
        nameObjOther.type = GlobalNamespace.Name.Type.OTHER; // Set type to OTHER.
        assertFalse(nameObjOther.isGetOrSetDefinition());
    }

    @Test
    public void testName_canCollapseUnannotatedChildNames_true() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        nameObj.type = GlobalNamespace.Name.Type.OTHER; // Type OTHER is fine.
        nameObj.globalSets = 1;
        nameObj.localSets = 0;
        nameObj.deleteProps = 0;
        nameObj.declaredType = false;
        nameObj.aliasingGets = 0; // No aliasing gets.
        assertTrue(nameObj.canCollapseUnannotatedChildNames());
    }

    @Test
    public void testName_canCollapseUnannotatedChildNames_false_aliasingGets() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        nameObj.type = GlobalNamespace.Name.Type.OTHER;
        nameObj.globalSets = 1;
        nameObj.aliasingGets = 1; // Has aliasing gets.
        assertFalse(nameObj.canCollapseUnannotatedChildNames()); // Cannot collapse if aliased.
    }

    @Test
    public void testName_needsToBeStubbed_true() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        nameObj.globalSets = 0; // No global sets.
        nameObj.localSets = 1; // Has local sets.
        assertTrue(nameObj.needsToBeStubbed()); // Needs stubbing if only locally defined.
    }

    @Test
    public void testName_setDeclaredType() throws Exception {
        GlobalNamespace.Name parentName = new GlobalNamespace.Name("parent", null, false);
        GlobalNamespace.Name childName = parentName.addProperty("child", false);
        childName.setDeclaredType(); // Mark child as declared type.

        assertTrue(childName.isDeclaredType()); // Check child is marked.
        assertTrue(parentName.hasDeclaredTypeDescendant); // Parent should know about descendant.
    }

    @Test
    public void testName_isNamespace() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("namespace", null, false);
        nameObj.type = GlobalNamespace.Name.Type.OBJECTLIT; // Must be an object literal.
        nameObj.hasDeclaredTypeDescendant = true; // Must have a declared type descendant.
        assertTrue(nameObj.isNamespace());
    }

    @Test
    public void testName_isSimpleName() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("simple", null, false);
        assertTrue(nameObj.isSimpleName()); // Top-level name.

        GlobalNamespace.Name qualifiedName = new GlobalNamespace.Name("qualified", nameObj, false);
        assertFalse(qualifiedName.isSimpleName()); // Nested name.
    }

    @Test
    public void testRef_isSet() throws Exception {
        Ref refSetGlobal = new Ref(module, scope, null, null, GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 0);
        assertTrue(refSetGlobal.isSet());
        Ref refSetLocal = new Ref(module, scope, null, null, GlobalNamespace.Ref.Type.SET_FROM_LOCAL, 0);
        assertTrue(refSetLocal.isSet());
        Ref refGet = new Ref(module, scope, null, null, GlobalNamespace.Ref.Type.DIRECT_GET, 0);
        assertFalse(refGet.isSet());
    }

    @Test
    public void testRef_markTwins() throws Exception {
        Ref ref1 = Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        Ref ref2 = Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);

        Ref.markTwins(ref1, ref2); // Mark them as twins.
        assertNotNull(ref1.getTwin());
        assertSame(ref2, ref1.getTwin());
        assertNotNull(ref2.getTwin());
        assertSame(ref1, ref2.getTwin());
    }

    @Test
    public void testRef_cloneAndReclassify() throws Exception {
        Ref originalRef = new Ref(module, scope, null, null, GlobalNamespace.Ref.Type.DIRECT_GET, 0);
        Ref newRef = originalRef.cloneAndReclassify(GlobalNamespace.Ref.Type.CALL_GET); // Reclassify to CALL_GET.

        assertNotNull(newRef);
        assertEquals(GlobalNamespace.Ref.Type.CALL_GET, newRef.type); // Type should be updated.
        // Other fields should be copied.
        assertSame(originalRef.node, newRef.node);
        assertSame(originalRef.name, newRef.name);
        assertSame(originalRef.module, newRef.module);
        assertSame(originalRef.source, newRef.source);
        assertSame(originalRef.scope, newRef.scope);
        assertEquals(originalRef.preOrderIndex, newRef.preOrderIndex);
    }

    @Test
    public void testTracker_process() throws Exception {
        // A basic test to ensure process doesn't crash. Mocking fully is complex.
        PrintStream ps = System.out; // Use System.out for a real PrintStream.
        Predicate<String> isInteresting = s -> s.startsWith("interesting_"); // A sample predicate.
        GlobalNamespace.Tracker tracker = new GlobalNamespace.Tracker(compiler, ps, isInteresting);

        // First call: previousSymbolsInTree is empty.
        tracker.process(externsRoot, root);
        // Second call: simulate some symbols.
        GlobalNamespace gn = new GlobalNamespace(compiler, externsRoot, root);
        gn.nameMap.put("interesting_sym1", new GlobalNamespace.Name("interesting_sym1", null, false));
        gn.nameMap.put("other_sym", new GlobalNamespace.Name("other_sym", null, false));
        gn.process(); // Manually call process on GlobalNamespace to populate it.

        tracker.process(externsRoot, root); // Should now have symbols to diff against.

        assertTrue(true); // Test passes if no exceptions are thrown.
    }

    // Additional tests for methods not fully covered.

    @Test
    public void testVisit_doesNotThrow() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        // Create a dummy NodeTraversal.
        NodeTraversal traversal = new NodeTraversal(compiler, new Callback() {
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
            @Override public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) { return true; }
        });
        // Call visit with dummy nodes.
        gn.new BuildGlobalNamespace().visit(traversal, new MockNode(Token.NAME, "test"), null);
        // If it completes without throwing an exception, the test passes.
        assertTrue(true);
    }

    @Test
    public void testShouldTraverse_basic() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        NodeTraversal traversal = new NodeTraversal(compiler, new Callback() {
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
            @Override public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) { return true; }
        });
        // Call shouldTraverse and assert it returns true (default behavior).
        assertTrue(gn.new BuildGlobalNamespace().shouldTraverse(traversal, new MockNode(Token.NAME, "test"), null));
    }

    @Test
    public void testCollect_nameNode_var() throws Exception {
        Node varNode = new MockNode(Token.VAR);
        Node nameNode = new MockNode(Token.NAME, "globalVar");
        varNode.addChildToBack(nameNode); // VAR contains the NAME.
        root.addChildToBack(varNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();
        // Call collect on the specific NAME node.
        gn.new BuildGlobalNamespace().collect(module, scope, nameNode);

        assertNotNull(gn.getNameIndex().get("globalVar"));
        assertEquals(1, gn.getNameIndex().get("globalVar").getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, gn.getNameIndex().get("globalVar").getRefs().get(0).type);
    }

    @Test
    public void testCollect_getprop_assign() throws Exception {
        Node assignNode = new MockNode(Token.ASSIGN);
        Node getProp = new MockNode(Token.GETPROP); // The node representing obj.prop.
        getProp.setString("obj.prop");
        getProp.addChildToBack(new MockNode(Token.NAME, "obj"));
        getProp.addChildToBack(new MockNode(Token.STRING_KEY, "prop"));
        assignNode.addChildToBack(getProp); // GETPROP is the left side of ASSIGN.
        assignNode.addChildToBack(new MockNode(Token.NUMBER, 123.0));
        root.addChildToBack(assignNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();
        // Call collect on the GETPROP node, which is part of an assignment.
        gn.new BuildGlobalNamespace().collect(module, scope, getProp);

        assertNotNull(gn.getNameIndex().get("obj.prop"));
        assertEquals(1, gn.getNameIndex().get("obj.prop").getRefs().size());
        // Should be SET_FROM_GLOBAL as it's on the left side of ASSIGN.
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, gn.getNameIndex().get("obj.prop").getRefs().get(0).type);
    }

    @Test
    public void testName_getName() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        assertEquals("testName", nameObj.getName());
    }

    @Test
    public void testName_getDeclaration() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        Ref declarationRef = Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        nameObj.declaration = declarationRef; // Manually set declaration.
        assertEquals(declarationRef, nameObj.getDeclaration());
    }

    @Test
    public void testName_isTypeInferred() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        // This method seems to be a stub returning false.
        assertFalse(nameObj.isTypeInferred());
    }

    @Test
    public void testName_getType() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        // This method returns null.
        assertNull(nameObj.getType());
    }

    @Test
    public void testName_getJSDocInfo() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        JSDocInfo info = new JSDocInfo();
        nameObj.docInfo = info; // Manually set docInfo.
        assertEquals(info, nameObj.getJSDocInfo());
    }

    @Test
    public void testRef_getNode() throws Exception {
        // Create a mock node.
        MockNode mockNode = new MockNode(Token.NAME, "testNode");
        Ref ref = new Ref(module, scope, mockNode, null, GlobalNamespace.Ref.Type.DIRECT_GET, 0);
        assertNotNull(ref.getNode());
        assertEquals(Token.NAME, ref.getNode().getType());
        assertEquals("testNode", ref.getNode().getString());
    }

    @Test
    public void testRef_getSourceFile() throws Exception {
        // Mock StaticSourceFile.
        StaticSourceFile mockSourceFile = new StaticSourceFile() {
            @Override public String getName() { return "mock.js"; }
            @Override public URL getUrl() { return null; }
            @Override public CharSequence getCode() { return ""; }
            @Override public String getLine(int i) { return ""; }
            @Override public int getLineCount() { return 0; }
            @Override public int getColumnOfOffset(int offset) { return 0; }
            @Override public int getLineOffset(int line) { return 0; }
            @Override public boolean isExtern() { return false; }
        };
        MockNode mockNode = new MockNode(Token.NAME, "testNode");
        // Attach the StaticSourceFile to the mock node using putProp.
        mockNode.putProp(Node.STATIC_SOURCE_FILE, mockSourceFile);
        Ref ref = new Ref(module, scope, mockNode, null, GlobalNamespace.Ref.Type.DIRECT_GET, 0);

        assertNotNull(ref.getSourceFile());
        assertEquals("mock.js", ref.getSourceFile().getName());
    }

    @Test
    public void testRef_getSymbol() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        Ref ref = new Ref(module, scope, new MockNode(Token.NAME, "testNode"), nameObj, GlobalNamespace.Ref.Type.DIRECT_GET, 0);
        // getSymbol should return the associated Name object.
        assertEquals(nameObj, ref.getSymbol());
    }
}





