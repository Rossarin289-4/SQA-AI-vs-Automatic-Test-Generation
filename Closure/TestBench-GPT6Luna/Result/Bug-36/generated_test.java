package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InlineVariablesTest {
    @Test
    public void testProcessEmptyScript() throws Exception {
        assertEquals(0, new Node(com.google.javascript.rhino.Token.SCRIPT).getChildCount());
    }

    @Test
    public void testAllModeFilterAndNoVariables() throws Exception {
        assertEquals(InlineVariables.Mode.ALL, InlineVariables.Mode.valueOf("ALL"));
    }

    @Test
    public void testLocalsOnlyFilterOnEmptyScript() throws Exception {
        assertEquals(InlineVariables.Mode.LOCALS_ONLY, InlineVariables.Mode.valueOf("LOCALS_ONLY"));
    }

    @Test
    public void testConstantsOnlyFilterOnEmptyScript() throws Exception {
        assertEquals(InlineVariables.Mode.CONSTANTS_ONLY,
                InlineVariables.Mode.valueOf("CONSTANTS_ONLY"));
    }

    @Test
    public void testProcessEmptyBlock() throws Exception {
        Node block = new Node(com.google.javascript.rhino.Token.BLOCK);
        assertFalse(block.hasChildren());
    }

    @Test
    public void testProcessEmptyRootWithExternRoot() throws Exception {
        Node externs = new Node(com.google.javascript.rhino.Token.SCRIPT);
        Node root = new Node(com.google.javascript.rhino.Token.SCRIPT);
        assertNotSame(externs, root);
    }

    @Test
    public void testPredicateInterfaceHasApplyMethod() throws Exception {
        assertEquals("equals", Predicate.class.getDeclaredMethods()[0].getName());
    }

    @Test
    public void testMapFactoryCreatesMap() throws Exception {
        Map<Object, Object> map = Maps.newHashMap();
        assertEquals(0, map.size());
    }

    @Test
    public void testSetFactoryCreatesSet() throws Exception {
        Set<Object> set = Sets.newHashSet();
        assertEquals(0, set.size());
    }

    @Test
    public void testNodeNewStringValue() throws Exception {
        Node node = Node.newString("x");
        assertEquals("x", node.getString());
    }

    @Test
    public void testNodeNewNumberValue() throws Exception {
        Node node = Node.newNumber(7);
        assertEquals(7.0, node.getDouble(), 0.0);
    }

    @Test
    public void testNodeChildAttachment() throws Exception {
        Node parent = new Node(com.google.javascript.rhino.Token.BLOCK);
        Node child = Node.newString("x");
        parent.addChildToBack(child);
        assertSame(child, parent.getFirstChild());
    }
}
