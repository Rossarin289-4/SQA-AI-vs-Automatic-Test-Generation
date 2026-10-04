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
import com.google.javascript.jscomp.SourceMap; // Import SourceMap for Format and DetailLevel
import com.google.javascript.jscomp.DiagnosticType; // Import DiagnosticType
import com.google.javascript.jscomp.TypeCheck; // Import TypeCheck
import com.google.javascript.jscomp.Compiler; // Import Compiler for Progress and Trampoline


public class AmbiguatePropertiesTest {
























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
    // This method was not part of the original AmbiguateProperties class, so it needs to be a helper method within the test class.
}





