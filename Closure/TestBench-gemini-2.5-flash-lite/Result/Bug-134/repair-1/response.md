```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.TypeValidator.TypeMismatch;
import com.google.javascript.jscomp.graph.AdjacencyGraph;
import com.google.javascript.jscomp.graph.Annotation;
import com.google.javascript.jscomp.graph.GraphColoring;
import com.google.javascript.jscomp.graph.GraphColoring.GreedyGraphColoring;
import com.google.javascript.jscomp.graph.GraphNode;
import com.google.javascript.jscomp.graph.SubGraph;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;
import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import java.util.logging.Level; // Added import for Level
import com.google.javascript.jscomp.SourceMap.Format; // Added import for Format
import com.google.javascript.jscomp.SourceMap.DetailLevel; // Added import for DetailLevel
import com.google.javascript.jscomp.FunctionRewriter; // Added import for FunctionRewriter
import com.google.javascript.jscomp.CrossModuleBinder; // Added import for CrossModuleBinder
import com.google.javascript.jscomp.CrossModuleMethodBinder; // Added import for CrossModuleMethodBinder
import com.google.javascript.jscomp.VariableMap; // Added import for VariableMap
import com.google.javascript.jscomp.RenamingMap; // Added import for RenamingMap
import com.google.javascript.jscomp.DiagnosticGroup; // Added import for DiagnosticGroup
import com.google.javascript.jscomp.DiagnosticType; // Added import for DiagnosticType


public class AmbiguatePropertiesTest {

    private static final AbstractCompiler MOCK_COMPILER = new MockCompiler(new JSTypeRegistry(null));

    @Test
    public void testFrequencyComparator_p1_greater() throws Exception {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        AmbiguateProperties.Property p1 = new AmbiguateProperties.Property("a");
        p1.numOccurrences = 5;
        AmbiguateProperties.Property p2 = new AmbiguateProperties.Property("b");
        p2.numOccurrences = 3;
        assertEquals(1, AmbiguateProperties.FREQUENCY_COMPARATOR.compare(p1, p2));
    }

    @Test
    public void testFrequencyComparator_p2_greater() throws Exception {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        AmbiguateProperties.Property p1 = new AmbiguateProperties.Property("a");
        p1.numOccurrences = 3;
        AmbiguateProperties.Property p2 = new AmbiguateProperties.Property("b");
        p2.numOccurrences = 5;
        assertEquals(-1, AmbiguateProperties.FREQUENCY_COMPARATOR.compare(p1, p2));
    }

    @Test
    public void testFrequencyComparator_equal_names() throws Exception {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        AmbiguateProperties.Property p1 = new AmbiguateProperties.Property("b");
        p1.numOccurrences = 5;
        AmbiguateProperties.Property p2 = new AmbiguateProperties.Property("a");
        p2.numOccurrences = 5;
        assertEquals(1, AmbiguateProperties.FREQUENCY_COMPARATOR.compare(p1, p2));
    }

    @Test
    public void testProcess_noProperties() throws Exception {
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[]{'a', 'b'});
        ap.process(externs, root);
        assertTrue(ap.getRenamingMap().isEmpty());
    }

    @Test
    public void testProcess_simpleProperties() throws Exception {
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node propA = new Node(Token.STRING, "a");
        Node getPropA = new Node(Token.GETPROP, new Node(Token.THIS), propA);
        root.addChildToBack(getPropA);
        Node propB = new Node(Token.STRING, "b");
        Node getPropB = new Node(Token.GETPROP, new Node(Token.THIS), propB);
        root.addChildToBack(getPropB);

        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[]{'a', 'b'});
        ap.process(externs, root);

        Map<String, String> renamingMap = ap.getRenamingMap();
        assertEquals(2, renamingMap.size());
        assertTrue(renamingMap.containsKey("a"));
        assertTrue(renamingMap.containsKey("b"));
        assertNotEquals(renamingMap.get("a"), renamingMap.get("b"));
    }

    @Test
    public void testProcess_externedProperties() throws Exception {
        Node externs = new Node(Token.SCRIPT);
        Node propExtern = new Node(Token.STRING, "extern");
        Node getPropExtern = new Node(Token.GETPROP, new Node(Token.THIS), propExtern);
        externs.addChildToBack(getPropExtern);

        Node root = new Node(Token.SCRIPT);
        Node propA = new Node(Token.STRING, "a");
        Node getPropA = new Node(Token.GETPROP, new Node(Token.THIS), propA);
        root.addChildToBack(getPropA);

        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[]{'a', 'b'});
        ap.process(externs, root);

        Map<String, String> renamingMap = ap.getRenamingMap();
        assertEquals(1, renamingMap.size());
        assertTrue(renamingMap.containsKey("a"));
        assertNotEquals("extern", renamingMap.get("a"));
    }

    @Test
    public void testProcess_quotedProperties() throws Exception {
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node propA = new Node(Token.STRING, "a");
        propA.putBooleanProp(Node.QUOTED_PROP, true);
        Node getPropA = new Node(Token.GETPROP, new Node(Token.THIS), propA);
        root.addChildToBack(getPropA);

        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[]{'a', 'b'});
        ap.process(externs, root);

        Map<String, String> renamingMap = ap.getRenamingMap();
        assertTrue(renamingMap.isEmpty()); // Quoted properties are not ambigulated.
    }

    @Test
    public void testProcess_skipPrefixProperties() throws Exception {
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node propSkip = new Node(Token.STRING, "JSAbstractCompiler_skip");
        Node getPropSkip = new Node(Token.GETPROP, new Node(Token.THIS), propSkip);
        root.addChildToBack(getPropSkip);

        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[]{'a', 'b'});
        ap.process(externs, root);

        Map<String, String> renamingMap = ap.getRenamingMap();
        assertTrue(renamingMap.isEmpty()); // Properties starting with SKIP_PREFIX are skipped.
    }

    @Test
    public void testProcess_complexGraph() throws Exception {
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);

        // a and b are related through type A
        Node getPropA1 = new Node(Token.GETPROP, new Node(Token.THIS), new Node(Token.STRING, "a"));
        getPropA1.setJSType(createJSType("A"));
        root.addChildToBack(getPropA1);

        Node getPropB1 = new Node(Token.GETPROP, new Node(Token.THIS), new Node(Token.STRING, "b"));
        getPropB1.setJSType(createJSType("A"));
        root.addChildToBack(getPropB1);

        // c and d are related through type B
        Node getPropC1 = new Node(Token.GETPROP, new Node(Token.THIS), new Node(Token.STRING, "c"));
        getPropC1.setJSType(createJSType("B"));
        root.addChildToBack(getPropC1);

        Node getPropD1 = new Node(Token.GETPROP, new Node(Token.THIS), new Node(Token.STRING, "d"));
        getPropD1.setJSType(createJSType("B"));
        root.addChildToBack(getPropD1);

        // e is related to a and b through type C (supertype of A)
        Node getPropE1 = new Node(Token.GETPROP, new Node(Token.THIS), new Node(Token.STRING, "e"));
        getPropE1.setJSType(createJSType("C"));
        root.addChildToBack(getPropE1);

        // f is related to c and d through type D (supertype of B)
        Node getPropF1 = new Node(Token.GETPROP, new Node(Token.THIS), new Node(Token.STRING, "f"));
        getPropF1.setJSType(createJSType("D"));
        root.addChildToBack(getPropF1);

        // g is related to a and b through type E (related to A)
        Node getPropG1 = new Node(Token.GETPROP, new Node(Token.THIS), new Node(Token.STRING, "g"));
        getPropG1.setJSType(createJSType("E"));
        root.addChildToBack(getPropG1);

        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'});
        ap.process(externs, root);

        Map<String, String> renamingMap = ap.getRenamingMap();
        assertEquals(7, renamingMap.size());

        String nameA = renamingMap.get("a");
        String nameB = renamingMap.get("b");
        String nameC = renamingMap.get("c");
        String nameD = renamingMap.get("d");
        String nameE = renamingMap.get("e");
        String nameF = renamingMap.get("f");
        String nameG = renamingMap.get("g");

        // Properties related through the same type should get different names
        assertNotEquals(nameA, nameB);
        assertNotEquals(nameC, nameD);

        // Properties related through different types may get the same name
        assertTrue((nameA.equals(nameC) && nameB.equals(nameD)) ||
                   (nameA.equals(nameD) && nameB.equals(nameC)));

        // Properties related through supertypes should be kept separate
        assertNotEquals(nameA, nameE);
        assertNotEquals(nameC, nameF);

        // Properties related through related types should be kept separate
        assertNotEquals(nameA, nameG);
    }

    @Test
    public void testAddType_invalidatingTypes() throws Exception {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        JSTypeRegistry registry = MOCK_COMPILER.getTypeRegistry();

        // Test with some invalidating types
        ap.addInvalidatingType(registry.getNativeType(JSTypeNative.ALL_TYPE));
        ap.addInvalidatingType(registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE));
        ap.addInvalidatingType(registry.getNativeType(JSTypeNative.VOID_TYPE));

        AmbiguateProperties.Property prop = new AmbiguateProperties.Property("testProp");
        prop.addType(registry.getNativeType(JSTypeNative.ALL_TYPE));
        assertTrue(prop.skipAmbiguating);

        prop = new AmbiguateProperties.Property("testProp2");
        prop.addType(registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE));
        assertTrue(prop.skipAmbiguating);

        prop = new AmbiguateProperties.Property("testProp3");
        prop.addType(registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertTrue(prop.skipAmbiguating);
    }

    @Test
    public void testAddType_unionType() throws Exception {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        JSTypeRegistry registry = MOCK_COMPILER.getTypeRegistry();
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unionType = registry.createUnionType(stringType, numberType);

        AmbiguateProperties.Property prop = new AmbiguateProperties.Property("testProp");
        prop.addType(unionType);

        assertFalse(prop.skipAmbiguating);
        assertEquals(2, prop.numOccurrences);
        assertEquals(2, prop.typesSet.cardinality());
    }

    @Test
    public void testAddType_invalidatingUnionType() throws Exception {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        JSTypeRegistry registry = MOCK_COMPILER.getTypeRegistry();
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        JSType unionType = registry.createUnionType(stringType, voidType);

        AmbiguateProperties.Property prop = new AmbiguateProperties.Property("testProp");
        prop.addType(unionType);

        assertTrue(prop.skipAmbiguating);
    }

    @Test
    public void testGetIntForType_newType() throws Exception {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        JSTypeRegistry registry = MOCK_COMPILER.getTypeRegistry();
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertEquals(1, ap.getIntForType(stringType));
    }

    @Test
    public void testGetIntForType_existingType() throws Exception {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        JSTypeRegistry registry = MOCK_COMPILER.getTypeRegistry();
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        ap.getIntForType(stringType); // first call
        assertEquals(1, ap.getIntForType(stringType)); // second call should return same int
    }

    @Test
    public void testComputeRelatedTypes_basic() throws Exception {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        JSTypeRegistry registry = MOCK_COMPILER.getTypeRegistry();
        JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);

        int objectInt = ap.getIntForType(objectType);
        int stringInt = ap.getIntForType(stringType);

        // Ensure type mapping is populated
        ap.getIntForType(objectType);
        ap.getIntForType(stringType);

        ap.computeRelatedTypes(stringType);
        JSTypeBitSet related = ap.relatedBitsets.get(stringType);

        assertTrue(related.get(objectInt));
        assertFalse(related.get(stringInt)); // A type is not related to itself in this context
    }

    @Test
    public void testComputeRelatedTypes_withConstructorAndInterfaces() throws Exception {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        JSTypeRegistry registry = MOCK_COMPILER.getTypeRegistry();

        // Mocking a complex type structure
        ObjectType interface1 = registry.createInterfaceType("Interface1");
        ObjectType interface2 = registry.createInterfaceType("Interface2");

        FunctionType constructorType = registry.createFunctionTypeWithNewInstance(
            "MyClass",
            new Node(Token.OBJECTLIT),
            registry.createFunctionPrototypeType(
                registry.getObjectTypeWithProperty("prop1", registry.getNativeType(JSTypeNative.NUMBER_TYPE))
            ),
            null
        );

        constructorType.setImplementedInterfaces(Lists.newArrayList(interface1, interface2));

        ObjectType instanceType = constructorType.getInstanceType();

        int instanceInt = ap.getIntForType(instanceType);
        int interface1Int = ap.getIntForType(interface1.getPrototype()); // Use prototype for comparison
        int interface2Int = ap.getIntForType(interface2.getPrototype()); // Use prototype for comparison
        int objectProtoInt = ap.getIntForType(registry.getNativeType(JSTypeNative.OBJECT_PROTOTYPE));

        // Populate type mappings
        ap.getIntForType(instanceType);
        ap.getIntForType(interface1.getPrototype());
        ap.getIntForType(interface2.getPrototype());
        ap.getIntForType(registry.getNativeType(JSTypeNative.OBJECT_PROTOTYPE));

        ap.computeRelatedTypes(instanceType);
        JSTypeBitSet related = ap.relatedBitsets.get(instanceType);

        assertTrue(related.get(instanceInt)); // Type should be related to itself
        assertTrue(related.get(interface1Int));
        assertTrue(related.get(interface2Int));
        assertTrue(related.get(objectProtoInt)); // Object.prototype is a supertype
    }

    @Test
    public void testPropertyGraphNode_getValue() {
        AmbiguateProperties.Property prop = new AmbiguateProperties.Property("test");
        AmbiguateProperties.PropertyGraphNode node = new AmbiguateProperties.PropertyGraphNode(prop);
        assertEquals(prop, node.getValue());
    }

    @Test
    public void testPropertyGraphNode_getAnnotation() {
        AmbiguateProperties.PropertyGraphNode node = new AmbiguateProperties.PropertyGraphNode(new AmbiguateProperties.Property("test"));
        assertNull(node.getAnnotation());
        Annotation annotation = new Annotation() { }; // Dummy annotation
        node.setAnnotation(annotation);
        assertEquals(annotation, node.getAnnotation());
    }

    @Test
    public void testPropertyGraphNode_setAnnotation() {
        AmbiguateProperties.PropertyGraphNode node = new AmbiguateProperties.PropertyGraphNode(new AmbiguateProperties.Property("test"));
        Annotation annotation = new Annotation() { }; // Dummy annotation
        node.setAnnotation(annotation);
        assertEquals(annotation, node.getAnnotation());
    }

    @Test
    public void testProcessExterns_getprop() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        Node externs = new Node(Token.SCRIPT);
        Node propNode = new Node(Token.STRING, "myExternProp");
        Node getPropNode = new Node(Token.GETPROP, new Node(Token.THIS), propNode);
        externs.addChildToBack(getPropNode);

        NodeTraversal traversal = new NodeTraversal(MOCK_COMPILER, ap.new ProcessExterns(), null);
        traversal.traverse(externs);

        assertTrue(ap.externedNames.contains("myExternProp"));
    }

    @Test
    public void testProcessExterns_objectlit() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        Node externs = new Node(Token.SCRIPT);
        Node objectLit = new Node(Token.OBJECTLIT);
        objectLit.addChildToBack(new Node(Token.STRING, "key1"));
        objectLit.addChildToBack(new Node(Token.STRING, "value1"));
        objectLit.addChildToBack(new Node(Token.STRING, "key2"));
        objectLit.addChildToBack(new Node(Token.STRING, "value2"));
        externs.addChildToBack(objectLit);

        NodeTraversal traversal = new NodeTraversal(MOCK_COMPILER, ap.new ProcessExterns(), null);
        traversal.traverse(externs);

        assertTrue(ap.externedNames.contains("key1"));
        assertTrue(ap.externedNames.contains("key2"));
    }

    @Test
    public void testProcessProperties_getprop() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        Node root = new Node(Token.SCRIPT);
        Node propNode = new Node(Token.STRING, "myProp");
        Node getPropNode = new Node(Token.GETPROP, new Node(Token.THIS), propNode);
        getPropNode.setJSType(MOCK_COMPILER.getTypeRegistry().getNativeType(JSTypeNative.STRING_TYPE));
        root.addChildToBack(getPropNode);

        NodeTraversal traversal = new NodeTraversal(MOCK_COMPILER, ap.new ProcessProperties(), null);
        traversal.traverse(root);

        assertEquals("myProp", ap.stringNodesToRename.get(0).getString());
        assertEquals(1, ap.stringNodesToRename.get(0).getJSType().getTypesInMap(ap.intForType).cardinality());
    }

    @Test
    public void testProcessProperties_objectlit_unquoted() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        Node root = new Node(Token.SCRIPT);
        Node objectLit = new Node(Token.OBJECTLIT);
        Node keyNode = new Node(Token.STRING, "myKey");
        objectLit.addChildToBack(keyNode);
        objectLit.addChildToBack(new Node(Token.STRING, "value"));
        objectLit.setJSType(MOCK_COMPILER.getTypeRegistry().getNativeType(JSTypeNative.OBJECT_TYPE));
        root.addChildToBack(objectLit);

        NodeTraversal traversal = new NodeTraversal(MOCK_COMPILER, ap.new ProcessProperties(), null);
        traversal.traverse(root);

        assertEquals("myKey", ap.stringNodesToRename.get(0).getString());
        assertEquals(1, ap.stringNodesToRename.get(0).getJSType().getTypesInMap(ap.intForType).cardinality());
    }

    @Test
    public void testProcessProperties_objectlit_quoted() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        Node root = new Node(Token.SCRIPT);
        Node objectLit = new Node(Token.OBJECTLIT);
        Node keyNode = new Node(Token.STRING, "myQuotedKey");
        keyNode.putBooleanProp(Node.QUOTED_PROP, true);
        objectLit.addChildToBack(keyNode);
        objectLit.addChildToBack(new Node(Token.STRING, "value"));
        objectLit.setJSType(MOCK_COMPILER.getTypeRegistry().getNativeType(JSTypeNative.OBJECT_TYPE));
        root.addChildToBack(objectLit);

        NodeTraversal traversal = new NodeTraversal(MOCK_COMPILER, ap.new ProcessProperties(), null);
        traversal.traverse(root);

        assertTrue(ap.quotedNames.contains("myQuotedKey"));
        assertTrue(ap.stringNodesToRename.isEmpty());
    }

    @Test
    public void testProcessProperties_getelem_quoted() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        Node root = new Node(Token.SCRIPT);
        Node objNode = new Node(Token.THIS);
        Node keyNode = new Node(Token.STRING, "myQuotedKey");
        Node getElemNode = new Node(Token.GETELEM, objNode, keyNode);
        getElemNode.setJSType(MOCK_COMPILER.getTypeRegistry().getNativeType(JSTypeNative.OBJECT_TYPE));
        root.addChildToBack(getElemNode);

        NodeTraversal traversal = new NodeTraversal(MOCK_COMPILER, ap.new ProcessProperties(), null);
        traversal.traverse(root);

        assertTrue(ap.quotedNames.contains("myQuotedKey"));
    }

    @Test
    public void testIsInvalidatingType_nullOrUndefined() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        JSTypeRegistry registry = MOCK_COMPILER.getTypeRegistry();
        assertTrue(ap.isInvalidatingType(registry.getNativeType(JSTypeNative.NULL_TYPE)));
        assertTrue(ap.isInvalidatingType(registry.getNativeType(JSTypeNative.VOID_TYPE)));
    }

    @Test
    public void testIsInvalidatingType_noType() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        JSTypeRegistry registry = MOCK_COMPILER.getTypeRegistry();
        assertTrue(ap.isInvalidatingType(registry.getNativeType(JSTypeNative.NO_TYPE)));
    }

    @Test
    public void testIsInvalidatingType_allType() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        JSTypeRegistry registry = MOCK_COMPILER.getTypeRegistry();
        assertTrue(ap.isInvalidatingType(registry.getNativeType(JSTypeNative.ALL_TYPE)));
    }

    @Test
    public void testIsInvalidatingType_unionWithInvalidating() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        JSTypeRegistry registry = MOCK_COMPILER.getTypeRegistry();
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        JSType unionType = registry.createUnionType(stringType, voidType);
        assertTrue(ap.isInvalidatingType(unionType));
    }

    @Test
    public void testIsInvalidatingType_normalType() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        JSTypeRegistry registry = MOCK_COMPILER.getTypeRegistry();
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertFalse(ap.isInvalidatingType(stringType));
    }

    @Test
    public void testGetProperty_newProperty() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        AmbiguateProperties.Property prop = ap.getProperty("newProp");
        assertEquals("newProp", prop.oldName);
        assertEquals(0, prop.numOccurrences);
    }

    @Test
    public void testGetProperty_existingProperty() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        AmbiguateProperties.Property prop1 = ap.getProperty("existingProp");
        AmbiguateProperties.Property prop2 = ap.getProperty("existingProp");
        assertSame(prop1, prop2);
    }

    @Test
    public void testGetJSType_unknownType() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        Node node = new Node(Token.NAME, "unknown");
        node.setJSType(null); // Simulate a missing type
        assertEquals(JSTypeNative.UNKNOWN_TYPE, ap.getJSType(node).getNativeId());
    }

    @Test
    public void testGetJSType_knownType() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        JSTypeRegistry registry = MOCK_COMPILER.getTypeRegistry();
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = new Node(Token.NAME, "string");
        node.setJSType(stringType);
        assertEquals(stringType, ap.getJSType(node));
    }

    // --- New tests for uncalled methods ---

    @Test
    public void testPropertyGraph_getNodes() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        Collection<AmbiguateProperties.Property> props = Lists.newArrayList();
        props.add(new AmbiguateProperties.Property("p1"));
        props.add(new AmbiguateProperties.Property("p2"));
        AmbiguateProperties.PropertyGraph graph = ap.new PropertyGraph(props);
        assertEquals(2, graph.getNodes().size());
    }

    @Test
    public void testPropertyGraph_getNode() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        Collection<AmbiguateProperties.Property> props = Lists.newArrayList();
        AmbiguateProperties.Property p1 = new AmbiguateProperties.Property("p1");
        props.add(p1);
        AmbiguateProperties.PropertyGraph graph = ap.new PropertyGraph(props);
        assertEquals(p1, graph.getNode(p1).getValue());
    }

    @Test
    public void testPropertyGraph_newSubGraph() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        Collection<AmbiguateProperties.Property> props = Lists.newArrayList();
        AmbiguateProperties.PropertyGraph graph = ap.new PropertyGraph(props);
        assertNotNull(graph.newSubGraph());
    }

    @Test
    public void testPropertyGraph_clearNodeAnnotations() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        Collection<AmbiguateProperties.Property> props = Lists.newArrayList();
        props.add(new AmbiguateProperties.Property("p1"));
        AmbiguateProperties.PropertyGraph graph = ap.new PropertyGraph(props);
        AmbiguateProperties.PropertyGraphNode node = (AmbiguateProperties.PropertyGraphNode) graph.getNode(props.iterator().next());
        node.setAnnotation(new Annotation() {});
        graph.clearNodeAnnotations();
        assertNull(node.getAnnotation());
    }

    @Test
    public void testPropertyGraph_getWeight() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        AmbiguateProperties.Property p1 = new AmbiguateProperties.Property("p1");
        p1.numOccurrences = 5;
        Collection<AmbiguateProperties.Property> props = Lists.newArrayList();
        props.add(p1);
        AmbiguateProperties.PropertyGraph graph = ap.new PropertyGraph(props);
        assertEquals(5, graph.getWeight(p1));
    }

    @Test
    public void testPropertySubGraph_isIndependentOf() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        JSTypeRegistry registry = MOCK_COMPILER.getTypeRegistry();
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        AmbiguateProperties.Property prop1 = new AmbiguateProperties.Property("p1");
        prop1.addType(stringType);
        ap.getIntForType(stringType);
        ap.computeRelatedTypes(stringType);

        AmbiguateProperties.Property prop2 = new AmbiguateProperties.Property("p2");
        prop2.addType(numberType);
        ap.getIntForType(numberType);
        ap.computeRelatedTypes(numberType);

        AmbiguateProperties.PropertySubGraph subGraph = ap.new PropertySubGraph();
        subGraph.addNode(prop1); // typesInSet will have stringType, typesRelatedToSet will have its related types

        // prop2 should be independent of prop1's subgraph if prop2's types are not related to prop1's types, and vice-versa
        assertTrue(subGraph.isIndependentOf(prop2));
    }

    @Test
    public void testPropertySubGraph_addNode() {
        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[0]);
        JSTypeRegistry registry = MOCK_COMPILER.getTypeRegistry();
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        AmbiguateProperties.Property prop1 = new AmbiguateProperties.Property("p1");
        prop1.addType(stringType);
        ap.getIntForType(stringType);
        ap.computeRelatedTypes(stringType);

        AmbiguateProperties.PropertySubGraph subGraph = ap.new PropertySubGraph();
        subGraph.addNode(prop1);

        assertTrue(subGraph.typesInSet.get(ap.getIntForType(stringType)));
        assertFalse(subGraph.typesRelatedToSet.get(ap.getIntForType(stringType))); // Related types for stringType do not include stringType itself
    }

    @Test
    public void testProcess_updateStringNodes() throws Exception {
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node propA = new Node(Token.STRING, "a");
        propA.putBooleanProp(Node.QUOTED_PROP, true); // Quoted property, should not be renamed
        Node getPropA = new Node(Token.GETPROP, new Node(Token.THIS), propA);
        root.addChildToBack(getPropA);

        // Add a property that will be renamed
        Node propB = new Node(Token.STRING, "b");
        Node getPropB = new Node(Token.GETPROP, new Node(Token.THIS), propB);
        root.addChildToBack(getPropB);

        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[]{'a', 'b', 'c'});
        ap.process(externs, root);

        // Ensure 'a' was not renamed, 'b' was.
        assertEquals("a", propA.getString());
        assertNotEquals("b", propB.getString());
        assertTrue(propB.getString().length() > 0); // Should have a new name.
    }

    @Test
    public void testProcess_multipleRenamingMapEntries() throws Exception {
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);

        Node propA = new Node(Token.STRING, "a");
        Node getPropA = new Node(Token.GETPROP, new Node(Token.THIS), propA);
        getPropA.setJSType(createJSType("TypeA"));
        root.addChildToBack(getPropA);

        Node propB = new Node(Token.STRING, "b");
        Node getPropB = new Node(Token.GETPROP, new Node(Token.THIS), propB);
        getPropB.setJSType(createJSType("TypeB"));
        root.addChildToBack(getPropB);

        AmbiguateProperties ap = new AmbiguateProperties(MOCK_COMPILER, new char[]{'a', 'b', 'c'});
        ap.process(externs, root);

        Map<String, String> renamingMap = ap.getRenamingMap();
        assertEquals(2, renamingMap.size());
        assertNotEquals(renamingMap.get("a"), renamingMap.get("b"));
    }

     // Mock implementations for testing purposes
    private static class MockCompiler extends AbstractCompiler {
        private final JSTypeRegistry typeRegistry;
        private final TypeValidator typeValidator;
        private final CodingConvention codingConvention;

        MockCompiler(JSTypeRegistry registry) {
            this.typeRegistry = registry;
            this.typeValidator = new TypeValidator(this);
            this.codingConvention = new CodingConvention.DefaultCodingConvention();
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return typeRegistry;
        }

        @Override
        public TypeValidator getTypeValidator() {
            return typeValidator;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return codingConvention;
        }

        @Override
        public String getSourcePath() { return "test.js"; }

        @Override
        public void report(JSError error) {}

        @Override
        public void reportCodeChange() {}

        @Override
        public CompilerInput getInput(String sourceName) {
            return new CompilerInput(new SourceFile(sourceName));
        }

        @Override
        public void addTypeDefiningFunction(TypedScopeCreator.AbstractScopeBuilder.Var var, JSType jSType) {}
        @Override
        public void addTypeDefiningFunction(TypedScopeCreator.AbstractScopeBuilder.Var var, JSType jSType, JSDocInfo jSDocInfo) {}
        @Override
        public void addTypeDefiningFunction(TypedScopeCreator.AbstractScopeBuilder.Var var, JSType jSType, JSDocInfo jSDocInfo, JSType jSType1) {}
        @Override
        public void addTypeDefiningFunction(TypedScopeCreator.AbstractScopeBuilder.Var var, JSType jSType, JSDocInfo jSDocInfo, JSType jSType1, ObjectType objectType) {}

        @Override
        public void addTypeDefiningFunction(TypedScopeCreator.AbstractScopeBuilder.Var var, JSType jSType, JSDocInfo jSDocInfo, JSType jSType1, ObjectType objectType, boolean b) {}
        @Override
        public void addTypeDefiningFunction(TypedScopeCreator.AbstractScopeBuilder.Var var, JSType jSType, JSDocInfo jSDocInfo, JSType jSType1, ObjectType objectType, boolean b, JSType jSType2) {}
        @Override
        public void addTypeDefiningFunction(TypedScopeCreator.AbstractScopeBuilder.Var var, JSType jSType, JSDocInfo jSDocInfo, JSType jSType1, ObjectType objectType, boolean b, JSType jSType2, JSType jSType3) {}
        @Override
        public void addTypeDefiningFunction(TypedScopeCreator.AbstractScopeBuilder.Var var, JSType jSType, JSDocInfo jSDocInfo, JSType jSType1, ObjectType objectType, boolean b, JSType jSType2, JSType jSType3, JSType jSType4) {}

        // Add necessary stub methods from AbstractCompiler
        @Override
        public NodeParse getNodeParse() { return null; }
        @Override
        public TypeCheck getTypeCheck() { return null; }
        @Override
        public OptimizeCalls createOptimizeCalls() { return null; }
        @Override
        public PassFactory getPassFactory(String name) { return null; }
        @Override
        public VarGraph getVarGraph() { return null; }
        @Override
        public void process(CompilerOptions options, SourceFile[] externs, SourceFile[] sources) {}
        @Override
        public String getLicenseId() { return ""; }
        @Override
        public String getCopyrightNotice() { return ""; }
        @Override
        public void debugLog(String message) {}
        @Override
        public void enableDisambiguation() {}
        @Override
        public void enableClosurePass() {}
        @Override
        public void enableNormalize() {}
        @Override
        public void enableGatherGraphInformation() {}
        @Override
        public void prepareAst(Node root) {}
        @Override
        public void process(Node externs, Node root) {}
        @Override
        public PassConfig getPassConfig() { return null; }
        @Override
        public PhaseOptimizer getPhaseOptimizer() { return null; }
        @Override
        public Set<String> getExternNames() { return null; }
        @Override
        public void process(Node externs, Node root, PassConfig passConfig) {}
        @Override
        public VariableMap getVariableMap() { return null; }
        @Override
        public VariableMap getFunctionMap() { return null; }
        @Override
        public RenamingMap getAminoMap() { return null; }
        @Override
        public void setPlaceholderTokens(Map<String, Node> placeholderTokens) {}
        @Override
        public Map<String, Node> getPlaceholderTokens() { return null; }
        @Override
        public String getAstHash() { return ""; }
        @Override
        public String getAstChangeCount() { return ""; }
        @Override
        public void setAstChangeCount(String astChangeCount) {}
        @Override
        public Set<String> getSetCodeReferences() { return null; }
        @Override
        public void prepareCodeForExpansion(CompilerOptions options) {}
        @Override
        public void expandJsModules(CompilerOptions options) {}
        @Override
        public void injectProvides(CompilerOptions options) {}
        @Override
        public void normalize(CompilerOptions options) {}
        @Override
        public void finalizeGeneration(CompilerOptions options) {}
        @Override
        public void process(CompilerOptions options) {}
        @Override
        public void updateGlobalIdSets(Map<String, Long> globalIdSets) {}
        @Override
        public Set<String> getGloballyDefinedProperties() { return null; }
        @Override
        public Set<String> getExternDefinedProperties() { return null; }
        @Override
        public void setExterns(List<SourceFile> externs) {}
        @Override
        public void setSources(List<SourceFile> sources) {}
        @Override
        public List<SourceFile> getSources() { return null; }
        @Override
        public List<SourceFile> getExterns() { return null; }
        @Override
        public void process(List<SourceFile> externs, List<SourceFile> sources) {}
        @Override
        public JSError[] getErrors() { return new JSError[0]; }
        @Override
        public JSError[] getWarnings() { return new JSError[0]; }
        @Override
        public boolean hasErrors() { return false; }
        @Override
        public void setProgressReceiver(Compiler.Progress progress) {}
        @Override
        public void sendProgress(int progress) {}
        @Override
        public void setLocalizationFunction(String locale, String functionName) {}
        @Override
        public void setLoggingLevel(Level level) {}
        @Override
        public void enableLineNumberSyntheticAttributes(boolean enable) {}
        @Override
        public void enableStripNameSuffixes(String ... suffixes) {}
        @Override
        public void enableGlobalIdPooling() {}
        @Override
        public void setPreferSingleQuotes(boolean preferSingleQuotes) {}
        @Override
        public void setTrampoline(Compiler.Trampoline trampoline) {}
        @Override
        public void setDeprecationGroup(String deprecationGroup) {}
        @Override
        public void setSourceMapPath(String sourceMapPath) {}
        @Override
        public void setSourceMapFormat(SourceMap.Format format) {}
        @Override
        public void setSourceMapDetailLevel(SourceMap.DetailLevel detailLevel) {}
        @Override
        public void setSourceMapIncludeComment(boolean include) {}
        @Override
        public void enableTrustedTypes() {}
        @Override
        public void setTrustedTypesPolicyName(String policyName) {}
        @Override
        public void disableOptimizer() {}
        @Override
        public void setAdditionalErrorForObjectLiteralConstructor(boolean enable) {}
        @Override
        public void setAdditionalErrorForTypedArray(boolean enable) {}
        @Override
        public void setPreserveGoogAssetFunction(boolean preserve) {}
        @Override
        public void setPreserveJsDocAnnotations(boolean preserve) {}
        @Override
        public void setAssumeForwardDeclarations(boolean assume) {}
        @Override
        public void setPreferFullTypeDetail(boolean prefer) {}
        @Override
        public void setTypeCheckLevel(TypeCheck.TypeCheckLevel level) {}
        @Override
        public void setFunctionRewriter(FunctionRewriter rewriter) {}
        @Override
        public void setGenerateFunctionNames(boolean generate) {}
        @Override
        public void setRenameVariableForObjectLit(boolean rename) {}
        @Override
        public void setOptimizeObjectLitMethods(boolean optimize) {}
        @Override
        public void setPreferConstructorAssignment(boolean prefer) {}
        @Override
        public void setInferParentTypes(boolean infer) {}
        @Override
        public void setCheckGlobalThis(boolean check) {}
        @Override
        public void setCheckMissingReturn(boolean check) {}
        @Override
        public void setCheckTypes(boolean check) {}
        @Override
        public void setInferTypes(boolean infer) {}
        @Override
        public void setAnalyzeRecursion(boolean analyze) {}
        @Override
        public void setCrossModuleBinder(CrossModuleBinder binder) {}
        @Override
        public void setCrossModuleMethodBinder(CrossModuleMethodBinder binder) {}
        @Override
        public void setVariableMap(VariableMap variableMap) {}
        @Override
        public void setFunctionMap(VariableMap functionMap) {}
        @Override
        public void setAminoMap(RenamingMap aminoMap) {}
        @Override
        public void setPlaceholderTokens(Set<String> placeholderTokens) {} // Corrected signature
        @Override
        public Map<String, Node> getPlaceholderTokens() { return null; }
        @Override
        public String getAstHash() { return ""; }
        @Override
        public String getAstChangeCount() { return ""; }
        @Override
        public void setAstChangeCount(String astChangeCount) {}
        @Override
        public Set<String> getSetCodeReferences() { return null; }
        @Override
        public void prepareCodeForExpansion(CompilerOptions options) {}
        @Override
        public void expandJsModules(CompilerOptions options) {}
        @Override
        public void injectProvides(CompilerOptions options) {}
        @Override
        public void normalize(CompilerOptions options) {}
        @Override
        public void finalizeGeneration(CompilerOptions options) {}
        @Override
        public void process(CompilerOptions options) {}
        @Override
        public void updateGlobalIdSets(Map<String, Long> globalIdSets) {}
        @Override
        public Set<String> getGloballyDefinedProperties() { return null; }
        @Override
        public Set<String> getExternDefinedProperties() { return null; }
        @Override
        public void setExterns(List<SourceFile> externs) {}
        @Override
        public void setSources(List<SourceFile> sources) {}
        @Override
        public List<SourceFile> getSources() { return null; }
        @Override
        public List<SourceFile> getExterns() { return null; }
        @Override
        public void process(List<SourceFile> externs, List<SourceFile> sources) {}
        @Override
        public JSError[] getErrors() { return new JSError[0]; }
        @Override
        public JSError[] getWarnings() { return new JSError[0]; }
        @Override
        public boolean hasErrors() { return false; }
        @Override
        public void setProgressReceiver(Compiler.Progress progress) {}
        @Override
        public void sendProgress(int progress) {}
        @Override
        public void setLocalizationFunction(String locale, String functionName) {}
        @Override
        public void setLoggingLevel(Level level) {}
        @Override
        public void enableLineNumberSyntheticAttributes(boolean enable) {}
        @Override
        public void enableStripNameSuffixes(String ... suffixes) {}
        @Override
        public void enableGlobalIdPooling() {}
        @Override
        public void setPreferSingleQuotes(boolean preferSingleQuotes) {}
        @Override
        public void setTrampoline(Compiler.Trampoline trampoline) {}
        @Override
        public void setDeprecationGroup(String deprecationGroup) {}
        @Override
        public void setSourceMapPath(String sourceMapPath) {}
        @Override
        public void setSourceMapFormat(SourceMap.Format format) {}
        @Override
        public void setSourceMapDetailLevel(SourceMap.DetailLevel detailLevel) {}
        @Override
        public void setSourceMapIncludeComment(boolean include) {}
        @Override
        public void enableTrustedTypes() {}
        @Override
        public void setTrustedTypesPolicyName(String policyName) {}
        @Override
        public void disableOptimizer() {}
        @Override
        public void setAdditionalErrorForObjectLiteralConstructor(boolean enable) {}
        @Override
        public void setAdditionalErrorForTypedArray(boolean enable) {}
        @Override
        public void setPreserveGoogAssetFunction(boolean preserve) {}
        @Override
        public void setPreserveJsDocAnnotations(boolean preserve) {}
        @Override
        public void setAssumeForwardDeclarations(boolean assume) {}
        @Override
        public void setPreferFullTypeDetail(boolean prefer) {}
        @Override
        public void setTypeCheckLevel(TypeCheck.TypeCheckLevel level) {}
        @Override
        public void setFunctionRewriter(FunctionRewriter rewriter) {}
        @Override
        public void setGenerateFunctionNames(boolean generate) {}
        @Override
        public void setRenameVariableForObjectLit(boolean rename) {}
        @Override
        public void setOptimizeObjectLitMethods(boolean optimize) {}
        @Override
        public void setPreferConstructorAssignment(boolean prefer) {}
        @Override
        public void setInferParentTypes(boolean infer) {}
        @Override
        public void setCheckGlobalThis(boolean check) {}
        @Override
        public void setCheckMissingReturn(boolean check) {}
        @Override
        public void setCheckTypes(boolean check) {}
        @Override
        public void setInferTypes(boolean infer) {}
        @Override
        public void setAnalyzeRecursion(boolean analyze) {}
        @Override
        public void setCrossModuleBinder(CrossModuleBinder binder) {}
        @Override
        public void setCrossModuleMethodBinder(CrossModuleMethodBinder binder) {}
        @Override
        public void setVariableMap(VariableMap variableMap) {}
        @Override
        public void setFunctionMap(VariableMap functionMap) {}
        @Override
        public void setAminoMap(RenamingMap aminoMap) {}

        // The following stub methods were added to resolve compile errors.
        // They represent methods that were likely part of the AbstractCompiler interface.
        // For the purpose of this test, they are not expected to be called.
        @Override
        public void setPlaceholderTokens(Set<String> placeholderTokens) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, Set<String> force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, Set<String> force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, Set<String> force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, Set<String> force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, Set<String> force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, Set<String> force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, Set<String> force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, Set<String> force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, Set<String> force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, boolean force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, Set<String> force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, Set<String> whitelist, Set<String> force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, Set<String> blacklist, String[] whitelist, String[] force, boolean allowAll) {}
        @Override
        public void setAliasStrings(boolean alias, String[] blacklist, Set<String> whitelist, String[] force, boolean allowAll) {}

        // The problematic method `setWarningsGuardedBy.Type` was renamed to `setWarningsGuardedByType`
        // and its signature adjusted to match common patterns in AbstractCompiler.
        @Override
        public void setWarningsGuardedByType(Set<DiagnosticType> type) {}
    }

    private JSType createJSType(String typeName) {
        JSTypeRegistry registry = MOCK_COMPILER.getTypeRegistry();
        if (typeName.equals("A")) {
            ObjectType objType = registry.createObjectType("A");
            return objType;
        } else if (typeName.equals("B")) {
            ObjectType objType = registry.createObjectType("B");
            return objType;
        } else if (typeName.equals("C")) {
            // C is supertype of A
            ObjectType cProto = registry.createObjectType("C");
            ObjectType aProto = registry.createObjectType("A");
            // Set up inheritance: A extends C
            FunctionType cCtor = registry.createFunctionType("C", null, null);
            FunctionType aCtor = registry.createFunctionType("A", null, null);
            aCtor.setSuperClassConstructor(cCtor);
            aProto.setConstructor(aCtor);
            aCtor.setInstanceType(aProto);
            return aProto;
        } else if (typeName.equals("D")) {
            // D is supertype of B
            ObjectType dProto = registry.createObjectType("D");
            ObjectType bProto = registry.createObjectType("B");
            // Set up inheritance: B extends D
            FunctionType dCtor = registry.createFunctionType("D", null, null);
            FunctionType bCtor = registry.createFunctionType("B", null, null);
            bCtor.setSuperClassConstructor(dCtor);
            bProto.setConstructor(bCtor);
            bCtor.setInstanceType(bProto);
            return bProto;
        } else if (typeName.equals("E")) {
            // E is related to A in some way (e.g., implemented interface)
            // For this test, we'll just make it a separate object type
            ObjectType eType = registry.createObjectType("E");
            return eType;
        } else if (typeName.equals("TypeA")) {
             return registry.getObjectTypeWithProperty("propA", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        } else if (typeName.equals("TypeB")) {
             return registry.getObjectTypeWithProperty("propB", registry.getNativeType(JSTypeNative.STRING_TYPE));
        }
        return registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    }

    // Helper to get JSType from Property.typesSet
    private JSTypeBitSet getTypesInMap(JSType type, Map<JSType, Integer> intForType) {
        if (type instanceof UnionType) {
            UnionType unionType = (UnionType) type;
            JSTypeBitSet combined = new JSTypeBitSet(intForType.size());
            for (JSType alternate : unionType.getAlternates()) {
                combined.or(getTypesInMap(alternate, intForType));
            }
            return combined;
        } else {
            JSTypeBitSet bitSet = new JSTypeBitSet(intForType.size());
            if (intForType.containsKey(type)) {
                bitSet.set(intForType.get(type));
            }
            return bitSet;
        }
    }
}
```