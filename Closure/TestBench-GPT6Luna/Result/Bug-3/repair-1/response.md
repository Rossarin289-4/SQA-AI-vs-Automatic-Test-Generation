```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.DataFlowAnalysis.FlowState;
import com.google.javascript.jscomp.MustBeReachingVariableDef.Definition;
import com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class FlowSensitiveInlineVariablesTest {
    @Test
    public void testProcessAcceptsEmptyScript() throws Exception {
        FlowSensitiveInlineVariables pass =
            new FlowSensitiveInlineVariables(new com.google.javascript.jscomp.Compiler());
        Node root = new Node(Token.SCRIPT);
        pass.process(null, root);
        assertEquals(Token.SCRIPT, root.getType());
    }

    @Test
    public void testProcessAcceptsEmptyExternsAndScript() throws Exception {
        FlowSensitiveInlineVariables pass =
            new FlowSensitiveInlineVariables(new com.google.javascript.jscomp.Compiler());
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        pass.process(externs, root);
        assertEquals(Token.SCRIPT, externs.getType());
        assertEquals(Token.SCRIPT, root.getType());
    }

    @Test
    public void testProcessPreservesScriptWithLiteralStatement() throws Exception {
        FlowSensitiveInlineVariables pass =
            new FlowSensitiveInlineVariables(new com.google.javascript.jscomp.Compiler());
        Node root = new Node(Token.SCRIPT);
        Node statement = new Node(Token.EXPR_RESULT, Node.newNumber(1));
        root.addChildToBack(statement);
        pass.process(null, root);
        assertSame(statement, root.getFirstChild());
    }
}
```