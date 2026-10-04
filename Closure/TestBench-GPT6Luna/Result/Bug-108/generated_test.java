package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SourcePosition;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class ScopedAliasesTest {
    @Test
    public void testWhatItChecks() throws Exception {
        assertEquals("goog.scope", ScopedAliases.SCOPING_METHOD_NAME);
    }

    @Test
    public void testNodeStringCreationAndReadback() throws Exception {
        Node name = Node.newString(Token.NAME, "item");
        assertEquals("item", name.getString());
    }

    @Test
    public void testNodeNumberCreationAndReadback() throws Exception {
        Node number = Node.newNumber(0);
        assertEquals(0.0, number.getDouble(), 0.0);
    }

    @Test
    public void testScopedAliasesScopeMethodConstant() throws Exception {
        assertEquals(10, ScopedAliases.SCOPING_METHOD_NAME.length());
    }

    @Test
    public void testDiagnosticKeyForImproperUse() throws Exception {
        assertEquals("JSC_GOOG_SCOPE_USED_IMPROPERLY",
                ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY.key);
    }

    @Test
    public void testDiagnosticKeyForBadParameters() throws Exception {
        assertEquals("JSC_GOOG_SCOPE_HAS_BAD_PARAMETERS",
                ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS.key);
    }

    @Test
    public void testDiagnosticKeyForThisReference() throws Exception {
        assertEquals("JSC_GOOG_SCOPE_REFERENCES_THIS",
                ScopedAliases.GOOG_SCOPE_REFERENCES_THIS.key);
    }

    @Test
    public void testDiagnosticKeyForReturn() throws Exception {
        assertEquals("JSC_GOOG_SCOPE_USES_RETURN",
                ScopedAliases.GOOG_SCOPE_USES_RETURN.key);
    }

    @Test
    public void testDiagnosticKeyForThrow() throws Exception {
        assertEquals("JSC_GOOG_SCOPE_USES_THROW",
                ScopedAliases.GOOG_SCOPE_USES_THROW.key);
    }

    @Test
    public void testDiagnosticKeyForAliasRedefined() throws Exception {
        assertEquals("JSC_GOOG_SCOPE_ALIAS_REDEFINED",
                ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED.key);
    }

    @Test
    public void testDiagnosticKeyForAliasCycle() throws Exception {
        assertEquals("JSC_GOOG_SCOPE_ALIAS_CYCLE",
                ScopedAliases.GOOG_SCOPE_ALIAS_CYCLE.key);
    }

    @Test
    public void testDiagnosticKeyForNonAliasLocal() throws Exception {
        assertEquals("JSC_GOOG_SCOPE_NON_ALIAS_LOCAL",
                ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL.key);
    }

    @Test
    public void testMultisetStartsEmpty() throws Exception {
        Multiset<String> names = HashMultiset.create();
        assertEquals(0, names.count("item"));
    }

    @Test
    public void testMultisetCountsRepeatedNames() throws Exception {
        Multiset<String> names = HashMultiset.create();
        names.add("item");
        names.add("item");
        assertEquals(2, names.count("item"));
    }

    @Test
    public void testSetIncludesInsertedName() throws Exception {
        Set<String> names = Sets.newHashSet();
        names.add("item");
        assertTrue(names.contains("item"));
    }

    @Test
    public void testMapReturnsInsertedValue() throws Exception {
        Map<String, String> names = Maps.newHashMap();
        names.put("key", "value");
        assertEquals("value", names.get("key"));
    }

    @Test
    public void testListRetainsInsertedNode() throws Exception {
        List<Node> nodes = Lists.newArrayList();
        Node node = Node.newString("value");
        nodes.add(node);
        assertSame(node, nodes.get(0));
    }
}
